import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<store> Store=new ArrayList<>();
        List<bill> billa=new ArrayList<>();
        int kgwant;
        int amount1=0;

        Store.add(new store("sugar",20,30));
        Store.add(new store("salt",30,20));
        Store.add(new store("t.paruppu",20,50));
        Store.add(new store("masala",20,45));
        Store.add(new store("Rise",20,40));
        Store.add(new store("k.paruppu",20,35));
        Store.add(new store("turmeric powder",20,70));
        Store.add(new store("vellam",20,90));
        store obj1=Store.get(0);
        store obj2=Store.get(1);
        store obj3=Store.get(2);
        store obj4=Store.get(3);
        store obj5=Store.get(4);


        store obj6=Store.get(5);
        store obj7=Store.get(6);
        store obj8=Store.get(7);



        int useroption=1;
        int itemwant;
        int AMOUNT=0;
        while(useroption==1)
        {
            System.out.println("if u want to buy---> 1");
            System.out.println("exit---> 2");
            useroption=sc.nextInt();
            if(useroption==1)
            {
                System.out.println("sugar--->1:price : "+obj1.price+" Available : "+obj1.Kg+" kg");
                System.out.println("salt--->2:price : "+obj2.price+" Available : "+obj2.Kg+" kg");
                System.out.println("t.paruppu--->3 :price : "+obj3.price+" Available : "+obj3.Kg+" kg");
                System.out.println("masala--->4 :price : "+obj4.price+" Available : "+obj4.Kg+" kg");
                System.out.println("Rise--->5 :price : "+obj5.price+" Available : "+obj5.Kg+" kg");
                System.out.println("k.paruppu--->6 :price : "+obj6.price+" Available : "+obj6.Kg+" kg");
                System.out.println("turmeric powder--->7:price : "+obj7.price+" Available : "+obj7.Kg+" kg");
                System.out.println("vellam--->8:price : "+obj8.price+" Available : "+obj8.Kg+" kg");
                System.out.println("which item u want");
                itemwant=sc.nextInt();
                if(itemwant>8)
                {
                    System.out.println("please enter valid result");
                }
                else
                {
                    System.out.println("enter how much kg u want");
                    kgwant = sc.nextInt();
                    switch (itemwant) {
                        case 1:
                            if (obj1.Kg >= kgwant) {
                                AMOUNT += kgwant * obj1.price;
                                System.out.println(kgwant + " kilo gram added in ur cart successfully");
                                obj1.Kg -= kgwant;
                                billa.add(new bill(obj1.item,obj1.price,kgwant,kgwant*obj1.price));

                            } else {
                                System.out.println("sorry we have only " + obj1.Kg + " kg in our store");
                            }

                            break;
                        case 2:
                            if (obj2.Kg >= kgwant) {
                                AMOUNT += kgwant * obj2.price;
                                System.out.println(kgwant + " kilo gram added in ur cart successfully");
                                obj2.Kg -= kgwant;
                                billa.add(new bill(obj2.item,obj2.price,kgwant,kgwant*obj2.price));
                            } else {
                                System.out.println("sorry we have only " + obj2.Kg + " kg in our store");
                            }
                            break;
                        case 3:
                            if (obj3.Kg >= kgwant) {
                                AMOUNT += kgwant * obj3.price;
                                System.out.println(kgwant + " kilo gram added in ur cart successfully");
                                obj3.Kg -= kgwant;
                                billa.add(new bill(obj3.item,obj3.price,kgwant,kgwant*obj3.price));
                            } else {
                                System.out.println("sorry we have only " + obj3.Kg + " kg in our store");
                            }
                            break;
                        case 4:
                            if (obj4.Kg >= kgwant) {
                                AMOUNT += kgwant * obj4.price;
                                System.out.println(kgwant + " kilo gram added in ur cart successfully");
                                obj4.Kg -= kgwant;
                                billa.add(new bill(obj4.item,obj4.price,kgwant,kgwant*obj4.price));
                            } else {
                                System.out.println("sorry we have only " + obj4.Kg + " kg in our store");
                            }
                            break;
                        case 5:
                            if (obj5.Kg >= kgwant) {
                                AMOUNT += kgwant * obj5.price;
                                System.out.println(kgwant + " kilo gram added in ur cart successfully");
                                obj5.Kg -= kgwant;
                                billa.add(new bill(obj5.item,obj5.price,kgwant,kgwant*obj5.price));
                            } else {
                                System.out.println("sorry we have only " + obj5.Kg + " kg in our store");
                            }
                            break;
                        case 6:
                            if (obj6.Kg >= kgwant) {
                                AMOUNT += kgwant * obj6.price;
                                System.out.println(kgwant + " kilo gram added in ur cart successfully");
                                obj6.Kg -= kgwant;
                                billa.add(new bill(obj6.item,obj6.price,kgwant,kgwant*obj6.price));
                            } else {
                                System.out.println("sorry we have only " + obj6.Kg + " kg in our store");
                            }
                            break;
                        case 7:
                            if (obj7.Kg >= kgwant) {
                                AMOUNT += kgwant * obj7.price;
                                System.out.println(kgwant + " kilo gram added in ur cart successfully");
                                obj7.Kg -= kgwant;
                                billa.add(new bill(obj7.item,obj7.price,kgwant,kgwant*obj7.price));
                            } else {
                                System.out.println("sorry we have only " + obj7.Kg + " kg in our store");
                            }
                            break;
                        case 8:
                            if (obj8.Kg >= kgwant) {
                                AMOUNT += kgwant * obj8.price;
                                System.out.println(kgwant + " kilo gram added in ur cart successfully");
                                obj8.Kg -= kgwant;
                                billa.add(new bill(obj8.item,obj8.price,kgwant,kgwant*obj8.price));
                            } else {
                                System.out.println("sorry we have only " + obj8.Kg + " kg in our store");
                            }
                            break;
                        default:
                            System.out.println("please enter valid list");
                    }
                }
                }

            }
        for(bill i:billa)
        {
            System.out.println("Item : "+i.itemName+",kilo : "+i.kg+" ,price per kg : " +i.prise+" ,total : "+i.total);
        }

        System.err.println("your total bill is : "+AMOUNT);
        }
}
class store
{
    String item;
    int Kg;
    int price;
    public store(String Item,int Kg,int price) {
        this.item= Item;
        this.Kg=Kg;
        this.price=price;
    }

}
class bill
{
    String itemName;
    int prise;
    int kg;
    int total;

    public bill(String item, int price, int kgwant,int total) {
        this.itemName=item;
        this.prise=price;
        this.kg=kgwant;
        this.total=total;
    }
}

