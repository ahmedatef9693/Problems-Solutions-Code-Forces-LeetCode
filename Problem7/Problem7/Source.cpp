#include<iostream>
using namespace std;
int** EnterInputs()
{
	int** arr = new int*[4];
	cout << "------ Entering Values ------" << endl;

	//making every element in the array of size 4
	for (int i = 0; i < 4; i++)
	{
		arr[i] = new int[4];
	}
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			cin >> arr[i][j];
		}
	}


	return arr;
}

bool Test(int**arr,int i,int j)
{
	int len = 2;
	int c = 0;
	bool check = false;
	for (i = 0; i < len; i++)
	{
		for (j = 0; j < len; j++)
		{
			if (arr[i][j] == 1)
			{
				c++;
			}
		}

		if (c == 3 ||c == 4)
		{
			check = true;
		}
	}
	c = 0;
	return check;
}


void main()
{
	

	int** arr = EnterInputs();
	bool checker = false;
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			cout << arr[i][j];
		}
		cout << endl;
	}
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			if (Test(arr,i,j))
			{
				checker = true;
			}
			else
			{
				checker = false;
			}
		}
	}
	if (checker)
	{
		cout << "True" << endl;
	}
	else
	{
		cout << "False" << endl;
	}



	system("pause");

}