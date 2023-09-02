package com.capg;


class GenerateReceipt {
    //this method for checking regular expression condition
    private boolean check(String name) {
         String regex = "^[a-zA-Z\\s'-]+$";

      return name.matches(regex);
    }

 

    public int verifyParty(Receipt r) {
        String buyer=r.transactionParty.buyer;
        String seller=r.transactionParty.seller;

        int count=0;
        // checking that buyer & seller is satisfy regular expression
        if(check(seller)) {
            count++;
        }
        if(check(buyer)) {
            count++;
        }
        //we are writing the count of string satisfy regular expression
        return count;
    }

 

    
    public String calcGST(Receipt r) {
        String s=r.productsQR;
        //" <Rate>,<Quantity> @ <Rate>,<Quantity> @ <Rate>,<Quantity>"
        //Above is string format to make separate rate & quantity the common point is "@" so split string using "@"
        String arr[]=s.split("@");

        //for total cost
        int totalCost=0;

        //Traversing the splited_array ==> [(rate,quantity) ,(rate,quantity) ,(rate,quantity) ]
        for(String k:arr) {
            //here we need separate rate & quantity & common point to separate  is( " , ")
            String arr2[]=k.split(",");

            if(arr2.length==2) {
                int a=Integer.parseInt(arr2[0]);
                int b=Integer.parseInt(arr2[1]);

                totalCost=totalCost+a*b;
            }
        }
        //GST formula
        double ansWithGst=totalCost*0.12;
        //return type is string so we need to make it into string
        return String.valueOf(ansWithGst);
    }

 

}