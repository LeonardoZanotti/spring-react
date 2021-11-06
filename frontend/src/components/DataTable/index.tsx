import axios from 'axios';
import Paginator from 'components/Paginator';
import { SalePage } from 'models/sale';
import React, { useEffect, useState } from 'react';
import { formatLocalDate } from 'utils/functions';
import { BASE_URL } from 'utils/requests';

function DataTable() {
  const [activePage, setActivePage] = useState(0);
  const [page, setPage] = useState<SalePage>({
    first: true,
    last: true,
    number: 0,
    totalElements: 0,
    totalPages: 0,
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/sales?page=${activePage}&size=20&sort=date,desc`).then((res) => {
      setPage(res.data);
    });
  }, [activePage]);

  const changePage = (index: number) => {
    setActivePage(index);
  };

  return (
    <>
      <Paginator page={page} onPageChange={changePage} />
      <div className="table-responsive">
        <table className="table table-striped table-sm">
          <thead>
            <tr>
              <th>Date</th>
              <th>Salesman</th>
              <th>Customers visited</th>
              <th>Closed deals</th>
              <th>Value</th>
            </tr>
          </thead>
          <tbody>
            {page.content?.map((item) => (
              <tr key={item.id}>
                <td>{formatLocalDate(item.date, 'dd/MM/yyyy')}</td>
                <td>{item.seller?.name}</td>
                <td>{item.visited}</td>
                <td>{item.deals}</td>
                <td>{item.amount?.toFixed(2)}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
}

export default DataTable;
