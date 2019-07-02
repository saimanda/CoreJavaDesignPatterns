package electricity.plans;

public class GetPlanFactory {

    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }

        if(planType.equalsIgnoreCase(PlanTypes.DOMESTIC.toString())){
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase(PlanTypes.COMMERICAL.toString())){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase(PlanTypes.INDUSTRIAL.toString())){
            return new IndustrailPlan();
        }
        return null;
    }
}
