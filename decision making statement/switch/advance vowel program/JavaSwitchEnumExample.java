//(co-of https://github.com/vikasdoddamani/programing-with-java)


public class JavaSwitchEnumExample {    
       public enum Day  
       {  
            Sun, Mon, Twe, Wed, Thu, Fri, Sat  
       }  
       public static void main(String args[])  
       {  
         Day[] DayNow = Day.values();  
           for (Day Now : DayNow)  
           {  
                switch (Now)  
                {  
                    case Sun:  
                    {     
                        System.out.println("Sunday");  
                        break;  
                    }  
                    case Mon:  
                    {  
                        System.out.println("Monday");  
                        break;  
                    }  
                    case Twe:  
                    {  
                        System.out.println("Twesday");  
                        break;       
                    }  
                    case Wed:  
                    {  
                        System.out.println("Wednesday");  
                        break;  
                    }  
                    case Thu:  
                    {  
                        System.out.println("Thursday");  
                        break;  
                    }  
                    case Fri:  
                    {  
                        System.out.println("Friday");  
                        break;  
                    }  
                    case Sat:  
                    {  
                        System.out.println("Saturday");  
                        break;  
                    }  
                }  
            }  
        }  
}  
