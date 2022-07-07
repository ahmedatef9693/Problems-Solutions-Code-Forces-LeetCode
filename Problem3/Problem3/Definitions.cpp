#include "Header.h"
int * sorting( int arr[])
{
	int size = sizeof(arr) / sizeof(int);

	for (int i = 0; i < size; i++)
	{
		for (int j = i+1; j < size; j++)
		{
			if (arr[j] > arr[i])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[i] = temp;
			}
		}
	}

	return arr;
}
int BearAndBigBrother(int A, int B)
{
	
	cout << "enter first number : ";
	cin >> A;
	cout << "enter second number : ";
	cin >> B;
	int index = 0;
	while (A <= B)
	{
		A *= 3;
		B *= 2;
		index++;
	}
	return index;

}
int Team(int N)
{
	int X = 0, Y = 0, Z = 0;
	cout << "enter number of problems : ";
	cin >> N;
	int CountOnes = 0;
	int *arr = new int[N];
	int mems[3] = { 0 };
	for (int ProblemNum = 0; ProblemNum < N; ProblemNum++)
	{
		    cout << "Enter Opinion For Problem " << ProblemNum + 1 << endl;
			cin >> X >> Y >> Z;
			int temp = NULL;
			if ((X + Y + Z) >= 2)
			{
				CountOnes += 1;
			}

	}


	return CountOnes;
}
