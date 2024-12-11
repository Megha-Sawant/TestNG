package testNG;

import org.testng.annotations.Test;

public class LoanDepartment
{
    @Test(groups={"Loan"})
    public void Carloan()
    {
        System.out.println("LoanDepartment-CarLoanPage");

    }
    @Test(groups={"Loan"})
    public void HomeLoan()
    {
        System.out.println("LoanDepartment-HomeLoanPage");
    }
    @Test(groups={"Loan"})
    public void EducationLoan()
    {
        System.out.println("LoanDepartment-EducationLoanPage");
    }
}
