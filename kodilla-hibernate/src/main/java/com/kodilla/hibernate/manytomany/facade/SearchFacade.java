package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> searchCompanyByName(String nameFragment) throws SearchProcessingException {

        List<Company> companyList = companyDao.retrieveCompaniesByNameFragment(nameFragment);

        if (companyList.size() == 0) {
            LOGGER.error("Company not found");
            throw new SearchProcessingException("No matching companies");

        } else {
            companyList.forEach(co -> LOGGER.info("Matching company found: "));
            return companyList;
        }

    }

    public List<Employee> searchEmployeeByName(String nameFragment) throws SearchProcessingException {

        List<Employee> employeeList = employeeDao.retrieveFromPartOfLastName(nameFragment);

        if (employeeList.size() == 0) {
            LOGGER.error("Employee not found");
            throw new SearchProcessingException("No matching employees");

        } else {
            employeeList.forEach(employee -> LOGGER.info("Matching employee found"));
            return employeeList;
        }

    }
}
