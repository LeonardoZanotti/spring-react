import axios from 'axios';
import { SaleSum } from 'models/sale';
import React from 'react';
import Chart from 'react-apexcharts';
import { BASE_URL } from 'utils/requests';

type ChartData = {
  labels: string[];
  series: number[];
};

function DonutChart() {
  let chartData: ChartData = { labels: [], series: [] };

  axios.get(`${BASE_URL}/sales/amount-by-seller`).then((res) => {
    const data = res.data as SaleSum[];
    const labels = data.map((d) => d.sellerName);
    const series = data.map((d) => d.sum);
    chartData = { labels, series };
  });

  // const mockData = {
  //   series: [477138, 499928, 444867, 220426, 473088],
  //   labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé'],
  // };

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
