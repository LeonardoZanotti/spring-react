import { SalePage } from 'models/sale';
import React from 'react';

type Props = {
  page: SalePage;
  onPageChange: Function;
};

const Paginator = ({ page, onPageChange }: Props) => {
  return (
    <nav className="d-flex justify-content-center">
      <ul className="pagination">
        <li className={`page-item ${page.first ? 'disabled' : ''}`}>
          <button className="page-link" onClick={() => onPageChange(--page.number)}>
            Previous
          </button>
        </li>
        <li className="page-item disabled">
          <span className="page-link">{page.number + 1}</span>
        </li>
        <li className={`page-item ${page.last ? 'disabled' : ''}`}>
          <button className="page-link" onClick={() => onPageChange(++page.number)}>
            Next
          </button>
        </li>
      </ul>
    </nav>
  );
};

export default Paginator;
