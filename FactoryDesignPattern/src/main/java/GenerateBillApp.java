import electricity.plans.GetPlanFactory;
import electricity.plans.Plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBillApp {

    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of the plan ..");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();

        System.out.println("Enter the number of units ..");
        int noOfUnits = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);
        System.out.println("Bill amount for "+planName+" and for "+noOfUnits+" units is :");
        p.getRate();
        p.calculateBill(noOfUnits);


    }
}
