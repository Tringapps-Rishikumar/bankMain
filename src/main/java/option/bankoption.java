package option;

import bankFunction.service;

public class bankoption extends service {
    public bankoption(){
        while(true) {
            bn.info("enter your choice 1)new user  2)deposit  3)withdraw  4)balance  5)display  6)exit ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    newAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    check();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    bn.info("enter valid chooice");
                    break;
            }
        }
    }
}
