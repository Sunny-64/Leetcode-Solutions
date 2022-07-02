// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

public class AvgSalaryExcludingMaxAndMin {

    public double average(int[] salary) {
        // find minimum
        double min = minimum(salary);
        // find maximum salary
        double max = maximum(salary);
        // total sum
        double total = sum(salary);
        return (total - (max + min)) / (salary.length - 2);
    }

    double minimum(int[] salary) {
        double min = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }
        }
        return min;
    }

    double maximum(int[] salary) {
        double max = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
        }
        return max;
    }

    double sum(int[] salary) {
        double total = 0;
        for (int i = 0; i < salary.length; i++) {
            total += salary[i];
        }
        return total;
    }

}
