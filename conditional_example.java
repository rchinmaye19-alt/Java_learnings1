class IfExample{
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18){
            System.out.println("You are in adult");
            
        }
    }
}

class GradeExample2{
    public static void main(String[] args){
        int marks = 85;

        if ( marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (marks >= 80) {
            System.out.println("Grade: B");
        }
        else if (marks >= 60) {
            System.out.println("Grade: c");

        }
    }
}

class LogicalOperatorsExample {
    public static void main(String[] args) {
        int age = 25;
        boolean hasTicket = true;

        if (age >= 18 && hasTicket) {
            System.out.println("You can enter the movie ");

        }

        boolean isWeekend = true;
        boolean isHoliday = false;

        if (isWeekend || isHoliday) {
            System.out.println("You can relax!");

        }
        boolean isRaning = false;

        if (!isRaning) {
            System.out.println("You don't need an umbrella");
        }
    }
} 

class ForLoopContDown {
    public static void main (String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

class ForLoopContDown2 {
    public static void main(String[] args) {
        for ( int i = 5 ; i >= 1; i--){
            System.out.println(i);
            
            
        }
    }
}
  class ForLoopContDown3 {

    
        public static void main(String[] args) {
            for(int i = 1; i <= 20; i++) {
                System.out.println(i);
            }
        }
    
  }