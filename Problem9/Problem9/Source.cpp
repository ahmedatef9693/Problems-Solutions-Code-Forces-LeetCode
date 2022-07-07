#include<iostream>
using namespace std;




void main()
{
	cout << " Problem 8" << endl;
	
	int S[4];
	
	int sizeofarr = sizeof(S) / sizeof(int);
	

	for (int i = 0; i < sizeofarr; i++)
	{
		cin >> S[i];
		
	}
	

	// Comparison Loop
	int NeededColors = 0;
	for (int i = 0; i < sizeofarr; i++)
	{
		for (int j = i+1; j < sizeofarr; j++)
		{
			if (S[i] == S[j])
			{
				//cout << "Index i Number = " << i << " First Number = " << S[i] << endl;
				NeededColors++;
			}
			//cout << NeededColors << endl;
			
		}
		if (NeededColors == sizeofarr - 1)
			break;


		

	
	}


	cout<< NeededColors << endl;




	system("pause");
}