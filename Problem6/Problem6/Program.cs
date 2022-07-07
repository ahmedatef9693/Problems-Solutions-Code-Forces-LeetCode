using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem6
{
    class Program
    {
        static void Nada()
        {
            int Row = 0;
            int Col = 0;
            for ( Row = 0; Row < 7; Row++)
            {
                for ( Col = 0; Col < 7; Col++)
                {
                    if (Col == 1 || Col == 5 || (Row == Col && Col != 0 && Col != 6))
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }
                Console.WriteLine();
            }


           Console.WriteLine("     ");


            for (Row = 0; Row < 7; Row++)
            {
                for (Col = 0; Col < 7; Col++)
                {
                    if (((Col == 1 || Col == 5) && Row != 0) || ((Row == 0 || Row == 3) && (Col > 1 && Col < 5)))
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }
                Console.WriteLine();
            }
            Console.WriteLine(" ");

            for (Row = 0; Row < 7; Row++)
            {
                for (Col = 0; Col < 7; Col++)
                {
                    if (Col == 1 || ((Row == 0 || Row == 6) && (Col > 1 && Col < 5)) || (Col == 5 && Row != 0 && Row != 6))
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }
                Console.WriteLine();
            }
            Console.WriteLine(" ");

            for (Row = 0; Row < 7; Row++)
            {
                for (Col = 0; Col < 7; Col++)
                {
                    if (((Col == 1 || Col == 5) && Row != 0) || ((Row == 0 || Row == 3) && (Col > 1 && Col < 5)))
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }
                Console.WriteLine();
            } 
        
        }

        static void Hala()
        {
            int Row;
            int Col;
            //H
            for (Row = 0; Row < 7; Row++)
            {
                for (Col = 0; Col < 7; Col++)
                {
                    if ((Col == 1 || Col == 5) || (Row == 3 && Col > 1 && Col < 6))
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }
                Console.WriteLine();
            }

            Console.WriteLine(" ");

            //A
            for (Row = 0; Row < 7; Row++)
            {
                for (Col = 0; Col < 7; Col++)
                {
                    if (((Col == 1 || Col == 5) && Row != 0) || ((Row == 0 || Row == 3) && (Col > 1 && Col < 5)))
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }
                Console.WriteLine();
            }
            Console.WriteLine(" ");

            //L
            for (Row = 0; Row < 7; Row++)
            {
                for (Col = 0; Col < 7; Col++)
                {
                    if (Col == 1 || (Row == 6 && Col != 0 && Col < 6))
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }
                Console.WriteLine();
            }
            Console.WriteLine(" ");
            
            //A
            for (Row = 0; Row < 7; Row++)
            {
                for (Col = 0; Col < 7; Col++)
                {
                    if (((Col == 1 || Col == 5) && Row != 0) || ((Row == 0 || Row == 3) && (Col > 1 && Col < 5)))
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }
                Console.WriteLine();
            }



        }
        static char[ , ] GetElements(char[,]arr)
        {
           
            
            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j < 5; j++)
                {
                    arr[i, j] = Console.ReadKey().KeyChar;
                    Console.Write(" ");
                }
                Console.WriteLine();
            }
            return arr;
        }
        static int BeautifulMatrix(char [,]arr)
        {
            int result = 0;
            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j < 5; j++)
                {
                    if(arr[i,j] == '1')
                    {
                        result = Math.Abs(i - 2) + Math.Abs(j - 2);
                        break;
                    }
                }
            }
            return result;

        }
        static void Main(string[] args)
        {
            
            char [,]arr = new char[5,5];
            char [,]NewArr = GetElements(arr);
            int result = BeautifulMatrix(NewArr);
            Console.WriteLine("Result  = " + result);
            

           

           

        }
    }
}
