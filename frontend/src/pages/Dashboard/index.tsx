import BarChart from 'components/BarChart';
import DataTable from 'components/DataTable';
import DonutChart from 'components/DonutChart';
import Footer from 'components/Footer';
import NavBar from 'components/NavBar';
import React from 'react';

function Dashboard() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h2 className="text-primary py-1">Dashboard</h2>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Success rate (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Sales</h5>
            <DonutChart />
          </div>
        </div>
        <div className="pt-3 pb-1">
          <h2 className="text-primary">All sales</h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default Dashboard;
