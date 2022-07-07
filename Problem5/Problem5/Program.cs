using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
namespace Problem5
{
    class Program
    {
        static char[,] GetElements()
        {
            char[,] myarr = new char[4, 4];
            Console.WriteLine("Length Of The Char Array = " + myarr.Length);
            int Iterations = myarr.Length / 4;
            Console.WriteLine("Iterations = " + Iterations);
            Console.WriteLine("==== Enter Your Elements ====");
            for (int i = 0; i < Iterations; i++)
            {
                for (int j = 0; j < Iterations; j++)
                {
                    
                    myarr[i, j] = Console.ReadKey().KeyChar;
                    Console.Write(" ");
                }
                Console.WriteLine();

            }

            return myarr;
        }
        static bool Check(char[,]chars)
        {
            
            bool flag = false;
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    if(i+1 == 4 || j+1 ==4)
                    {
                        break;
                    }
                    else if((chars[i,j] == chars[i,j+1]) && (chars[i,j] == chars[i+1,j])  && (chars[i,j] == chars[i+1,j+1]))
                    {
                        flag = true;
                    }
                   
                }
            }

            
            return flag;
        }
        
        static char[,] manipulate(char [,]chars)
        {

            int current = chars.Length;
            Console.WriteLine("Length of the array = " + current);
          

            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    if ((i + 1 == 4) || (j + 1 == 4))
                    {
                        break;
                    }
                    else if((chars[i, j] == chars[i, j + 1]) && (chars[i, j] == chars[i + 1, j]) && (chars[i, j] != chars[i + 1, j + 1]))
                    {
                        chars[i + 1, j + 1] = chars[i, j];
                        Check(chars);
                        Console.WriteLine("Case 1");

                        return chars;

                    }
                    else if((chars[i, j] == chars[i, j + 1]) && (chars[i, j] == chars[i + 1, j + 1]) && (chars[i, j] != chars[i + 1 , j]))
                    {
                        chars[i + 1, j] = chars[i, j];
                        Check(chars);
                        Console.WriteLine("Case 2");
                        return chars;
                    }
                    else if((chars[i, j] == chars[i + 1, j]) && (chars[i, j] == chars[i + 1, j + 1]) && (chars[i, j] != chars[i , j + 1]))
                    {
                        chars[i, j + 1] = chars[i, j];
                        Check(chars);
                        Console.WriteLine("Case 3");
                        return chars;
                    }
                    else if((chars[i+1, j] == chars[i + 1, j+1]) && (chars[i, j+1] == chars[i + 1, j + 1]) && (chars[i, j] != chars[i , j + 1]))
                    {
                        chars[i, j] = chars[i + 1, j];
                        Check(chars);
                        Console.WriteLine("Case 4");
                        return chars;

                    }
                    else
                    {
                        return chars;
                    }

                }
                
            }



            return chars;
        }
        static void ShowArray(char[,]arr)
        {
            Console.WriteLine("Elements Of Array After Manipulation");
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    Console.Write(arr[i, j]);
                    Console.Write(" ");
                }
                Console.WriteLine("");
            }

        }

      

        
        static void Main(string[] args)
        {
            
            
            //Getting Elements Of The Array
            char [ , ] newarr = GetElements();
            char[,] LastOne = new char[4, 4];
            if(Check(newarr))
            {
                
                Console.WriteLine("True");
                LastOne = manipulate(newarr);
                ShowArray(LastOne);
                
            }
            else
            {
              
                 
                
                Console.WriteLine(" False And We Will Try To Manipulate The Array ! ");
                manipulate(newarr);

            }




            













        }
    }
}
