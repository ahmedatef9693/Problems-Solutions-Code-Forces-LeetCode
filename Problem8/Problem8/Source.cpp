#include<iostream>
using namespace std;
void main()
{


	int arr[16];
	int movaverage = 4;
	int arrlength = sizeof(arr) / sizeof(arr[0]);
	
	for (int i = 0; i < arrlength; i++)
	{
		arr[i] = i + 1;
	}

	float sum = 0.0;
	float average = 0.0;
	int i, j;
	int count = movaverage;
	for (i = 0; i < arrlength-1; i+=movaverage)
	{
		sum = 0;
		
		for (j = i; j < i + movaverage; j++)
		{
			/*cout << j << endl;*/
			sum += arr[j];
			//cout << "summation = " << sum << endl;
			
		}
		cout << "Sum = " << sum << endl;
		average = sum / count;
		cout << "average = " << average << endl;
		cout << endl;


	}






	



	system("pause");
}