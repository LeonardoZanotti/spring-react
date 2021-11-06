import axios from 'axios';
import { SaleSum } from 'models/sale';
import React, { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { BASE_URL } from 'utils/requests';

type ChartData = {
  labels: string[];
  series: number[];
};

function DonutChart() {
  const [chartData, setChartData] = useState<ChartData>({ labels: [], series: [] });

  useEffect(() => {
    axios.get(`${BASE_URL}/sales/amount-by-seller`).then((res) => {
      const data = res.data as SaleSum[];
      const labels = data.map((d) => d.sellerName);
      const series = data.map((d) => d.sum);
      setChartData({ labels, series });
    });
  }, []);

  const options = {
    legend: {
      show: true,
    },
  };

  return (
    <Chart options={{ ...options, labels: chartData.labels }} series={chartData.series} type="donut" height="240" />
  );
}

export default DonutChart;
