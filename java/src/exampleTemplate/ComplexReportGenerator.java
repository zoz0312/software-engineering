package src.exampleTemplate;

import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {
    @Override
    protected boolean customerReportCondition(Customer customer) {
        return customer.getPoint() >= 100;
    }

    @Override
    protected String getReportHeader(List<Customer> customers) {
        return String.format("고객의 수 [%d]명\n", customers.size());
    }

    @Override
    protected String getReportForCustomer(Customer customer) {
        return String.format("[%s] [%d]\n", customer.getName(), customer.getPoint());
    }

    @Override
    protected String getReportFooter(List<Customer> customers) {
        int totalPoint = 0;
        for (Customer customer : customers) {
            totalPoint += customer.getPoint();
        }

        return String.format("포인트 합계 [%d]\n", totalPoint);
    }
}

