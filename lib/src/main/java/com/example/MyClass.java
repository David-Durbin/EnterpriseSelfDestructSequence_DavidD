package com.example;

public class MyClass {

    public static void main(String[] args)
    {
        boolean destruct[] = {false, false, false, false};

        String destructCode[] = {"11A", "11A2B", "1B2B3", "000 DESTRUCT 0"};

        System.out.println("\t\tUSS Enterprise Self Destruct Sequence\n");

        System.out.println("Enter Destruct Sequence Code: \n");

        for(int i = 0; i < 4; i++)
        {
            if(destruct[i] == false)
            {
                destruct[i] = true;
                System.out.println(destructCode[i]);
            }
        }

        if(destruct[0] == true && destruct[1] == true && destruct[2] == true && destruct[3] == true)
        {
            System.out.println("\nSelf Destruct Sequence Activated");
            for(int c = 60; c > 0; c--)
            {
                System.out.println(c + " Seconds");
            }

            System.out.println("BOOM!");

        }
        else
        {
            System.out.println("Self Destruct Sequence Aborted");
        }

    }
}
