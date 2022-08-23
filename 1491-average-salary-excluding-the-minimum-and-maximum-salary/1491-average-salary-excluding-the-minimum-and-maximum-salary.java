class Solution {
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        for(int i=0; i<salary.length; i++){
            minSalary = Math.min(minSalary,salary[i]);
            maxSalary = Math.max(maxSalary,salary[i]);
        }
        double sum=0;
        for(int j=0; j<salary.length;j++){
            if(salary[j]!=maxSalary && salary[j]!=minSalary){
                sum+=salary[j];
            }
        }
        return sum/(salary.length-2);
        
    }
}