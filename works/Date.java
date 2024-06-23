package works;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input a month: ");
        int month = s.nextInt();

        System.out.print("Input a date: ");
        int date = s.nextInt();

        System.out.print("Input a year: ");
        int year = s.nextInt();

        System.out.println("------------------------------------------");

        System.out.println("Month: " + month);
        System.out.println("Date : " + date);
        System.out.println("Year : " + year);
        
        System.out.println();

        String finalDate = "";

        switch (month){
            case 1:
            finalDate = "January";    
                break;
            case 2:
            finalDate = "February";
                break;
            case 3:
            finalDate = "March";
                break;
            case 4:
            finalDate = "April";
                break;
            case 5:
            finalDate = "May";
                break;
            case 6:
            finalDate = "June";
                break;
            case 7:
            finalDate = "July";
                break;
            case 8:
                finalDate = "August";
                break;
            case 9:
            finalDate = "September";
                break;
            case 10:
            finalDate = "October";
                break;
            case 11:
            finalDate = "November";
                break;
            case 12:
            finalDate = "December";
                break;
            default:
                
        }
            if (finalDate == "") {
                System.out.println("Invalid Month");
            }else if (date > 31 || date <= 0){
                 System.out.println("Invalid date");
                }   
                else{ System.out.println(finalDate + " " + date + ", " + year);
                }
            }

    }

