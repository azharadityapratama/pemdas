public class Main {

    public static void main(String[] args) {
        // Do not change

        task1("Rahman Arif/17-02-2003/Jakarta/M/A/WNI/Single");
        // task1("Alice Rebecca/17-03-1984/London/F/O/WNA/Married");
        // task2("Wanda");
        // task3();
        // task4("5,8,9,11,10");
    }

    public static String task1(String data) {
        // Your code here
        // ...

        int startPosition = 0;
        // find the first slash position within string stored in variable named data
        int slashPosition = data.indexOf("/");
        // chop the string from the beginning to the first slash position (/ is
        // excluded)
        String name = data.substring(startPosition, slashPosition);
        // split and reverse the name to correct firstname and lastname order
        String firstName = name.substring(name.indexOf(" ") + 1, slashPosition);
        String lastName = name.substring(0, name.indexOf(" "));
        // get the first character of first and last name
        String initial = "" + firstName.charAt(0) + lastName.charAt(0);

        // chop the string stored in variable named data from the first slash (excluded)
        // to the end
        data = data.substring(slashPosition + 1);
        // find the position of the next slash
        slashPosition = data.indexOf("/");
        // chop the date of birth dd-mm-yyyy
        String birthDate = data.substring(startPosition, slashPosition);
        // chop the year of birth yyyy
        String birthYear = birthDate.substring(6, 10);
        // count the age
        int age = 2024 - (Integer.parseInt(birthYear));

        // chop the string stored in variable named data from the second slash
        // (excluded) to the end
        data = data.substring(slashPosition + 1);
        // find the position of the next slash
        slashPosition = data.indexOf("/");
        // chop the palce of birth
        String birthPlace = data.substring(startPosition, slashPosition);

        // chop the string stored in variable named data from the third slash (excluded)
        // to the end
        data = data.substring(slashPosition + 1);
        // find the position of the next slash
        slashPosition = data.indexOf("/");
        // chop the sex data M or F
        String sex = data.substring(startPosition, slashPosition);
        // change M to Male and F to Female
        sex = sex.replace("M", "Male");
        sex = sex.replace("F", "Female");

        // chop the string stored in variable named data from the fourth slash
        // (excluded) to the end
        data = data.substring(slashPosition + 1);
        // find the position of the next slash
        slashPosition = data.indexOf("/");
        // chop the blood type data
        String bloodType = data.substring(startPosition, slashPosition);

        // chop the string stored in variable named data from the fifth slash (excluded)
        // to the end
        data = data.substring(slashPosition + 1);
        // find the position of the next slash
        slashPosition = data.indexOf("/");
        // chop the citizenship data
        String citizen = data.substring(startPosition, slashPosition);
        // check whether local citizen
        boolean isLocalCitizenB = citizen.contains("WNI");
        // change true or false to Yes or No
        String isLocalCitizen = "" + isLocalCitizenB;
        isLocalCitizen = isLocalCitizen.replace("true", "Yes");
        isLocalCitizen = isLocalCitizen.replace("false", "No");

        // chop the string stored in variable named data from the sixth slash (excluded)
        // to the end
        data = data.substring(slashPosition + 1);
        // chop the marital status data
        String maritalStatus = data.substring(startPosition);

        // generating the output
        String line1 = "Full Name: " + firstName + " " + lastName + " (" + initial + ")";
        String line2 = "Age: " + age;
        String line3 = "City of Birth: " + birthPlace;
        String line4 = "Sex: " + sex;
        String line5 = "Blood Type: " + bloodType;
        String line6 = "Local Citizen: " + isLocalCitizen;
        String line7 = "Marital Status: " + maritalStatus;

        // store the output to variable named output
        String output = line1 + "\n" + line2 + "\n" + line3 + "\n" + line4
                + "\n" + line5 + "\n" + line6 + "\n" + line7 + "\n";

        // print out the output
        System.out.println(output);

        return output;
    }

    public static String task2(String name) {
        // Your code here
        // ...

        // store all alphabet to single string
        // each alphabet with its index: a -> 0, b->1. ... z ->25
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // change the input to lowercase, since tha alphabets are all in lowercase
        name = name.toLowerCase();

        // set the key
        int key = 5;

        // shift each character to 5 places right, if more than 25 then it back to 0
        String k1 = "" + alphabet.charAt((name.charAt(0) - 97 + key) % 26);
        String k2 = "" + alphabet.charAt((name.charAt(1) - 97 + key) % 26);
        String k3 = "" + alphabet.charAt((name.charAt(2) - 97 + key) % 26);
        String k4 = "" + alphabet.charAt((name.charAt(3) - 97 + key) % 26);
        String k5 = "" + alphabet.charAt((name.charAt(4) - 97 + key) % 26);

        // change the first character to upper case
        k1 = k1.toUpperCase();

        // generate the output
        String output = k1 + k2 + k3 + k4 + k5;

        // print out the output
        System.out.println(output);

        // return the output
        return output;
    }

    public static void task3() {

        // declare and initialize the variables

        int priceOfCoffee = 15000;
        int priceOfTea = 10000;
        int priceOfPizza = 45000;
        char currency = '$';
        int numOfCoffee = 3;
        int numOfTea = 5;
        int numOfPizza = 1;
        String nameOfCustomer = "Albert";

        double discountOfCoffee = 0.10;
        double discountOfTea = 0.15;
        double discountOfPizza = 0.05;
        double tax = 0.11;
        double cashInHand = 200000;

        // count number of items
        int numOfItems = numOfCoffee + numOfTea + numOfPizza;

        double endPriceOfCoffee = priceOfCoffee * numOfCoffee * (1 - discountOfCoffee);
        double endPriceOfTea = priceOfTea * numOfTea * (1 - discountOfTea);
        double endPriceOfPizza = priceOfPizza * numOfPizza * (1 - discountOfPizza);

        // count the total price
        double totalPrice = endPriceOfCoffee + endPriceOfTea + endPriceOfPizza;
        // count the total price after tax
        double totalPriceAfterTax = totalPrice * (1 + tax);
        // print total price
        System.out.println("Total Price: " + currency + totalPrice);

        // count the change
        double change = cashInHand - totalPriceAfterTax;
        // printing the change
        System.out.println("Change: " + change);

        // count amount of donation
        double donation = change % 1000;
        System.out.println("Donation: " + donation);

        // print the receipt
        System.out.println("-----------------------------------\n");
        System.out.println("Name Of Customer: " + nameOfCustomer);
        System.out.println("ORDERS");
        System.out.println("Number of items: " + numOfItems);
        System.out.println("Tea\t|\t" + numOfTea + "\t|\t" + endPriceOfTea);
        System.out.println("Coffee\t|\t" + numOfCoffee + "\t|\t" + endPriceOfCoffee);
        System.out.println("Pizza\t|\t" + numOfPizza + "\t|\t" + endPriceOfPizza);
        System.out.println("Total Before Tax: " + totalPrice);
        System.out.println("Tax: " + tax * 100 + "%");
        System.out.println("Total After Tax: " + totalPriceAfterTax);
        System.out.println("Amount Paid: " + cashInHand);
        System.out.println("Change: " + change);
        System.out.println("Donation Amount: " + donation);
        System.out.println("\n-----------------------------------");
    }

    public static void task4(String row) {
        // Your code goes here
        // ...
        int n1 = Integer.parseInt(row.substring(0, row.indexOf(",")));

        row = row.substring(row.indexOf(",") + 1);
        int n2 = Integer.parseInt(row.substring(0, row.indexOf(",")));

        row = row.substring(row.indexOf(",") + 1);
        int n3 = Integer.parseInt(row.substring(0, row.indexOf(",")));

        row = row.substring(row.indexOf(",") + 1);
        int n4 = Integer.parseInt(row.substring(0, row.indexOf(",")));

        row = row.substring(row.indexOf(",") + 1);
        int n5 = Integer.parseInt(row.substring(0));

        double avg = (n1 + n2 + n3 + n4 + n5)/5.0;

        System.out.println(avg);
    }
}
