import Footer from 'components/Footer';
import NavBar from 'components/NavBar';
import React from 'react';
import { Link } from 'react-router-dom';

function Home() {
  return (
    <>
      <NavBar />
      <div className="container">
        <div className="jumbotron">
          <h1 className="display-4">Spring react</h1>
          <p className="lead">Analyse the performance of your sales with different perspectives</p>
          <hr />
          <p>
            This application consists in a dashboard, that receives data from the spring boot backend, and then makes
            graphs and tables to show the data in a beutier way
          </p>
          <Link className="btn btn-primary btn-lg" to="/dashboard">
            Dashboard
          </Link>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default Home;
