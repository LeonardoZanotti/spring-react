import axios from 'axios';
import { SaleSuccess } from 'models/sale';
import React, { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { BASE_URL } from 'utils/requests';
import { round } from 'utils/round';

type SeriesData = {
  name: string;
  data: number[];
};

type ChartData = {
  labels: {
    categories: string[];
  };
  series: SeriesData[];
};

function BarChart() {
  const [chartData, setChartData] = useState<ChartData>({
    labels: {
      categories: [],
    },
    series: [
      {
        name: '',
        data: [],
      },
    ],
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/sales/success-by-seller`).then((res) => {
      const data = res.data as SaleSuccess[];
      const labels = data.map((d) => d.sellerName);
      const series = data.map((d) => round((100.0 * d.deals) / d.visited, 1));
      setChartData({
        labels: {
          categories: labels,
        },
        series: [
          {
            name: 'Success rate (%)',
            data: series,
          },
        ],
      });
    });
  }, []);

  const options = {
    plotOptions: {
      bar: {
        horizontal: true,
      },
    },
  };

  return <Chart options={{ ...options, xaxis: chartData.labels }} series={chartData.series} type="bar" height="240" />;
}

export default BarChart;
