#include<iostream>
#include<string>
#include<set>
#include<iterator>
using namespace std;












int main()
{
	//Initialization
	int NumberOfStones = 0;
	string InputStonesColors = "";
	cout << "Enter Number Of Stones" << endl;
	cin >> NumberOfStones;
	cin.ignore();
	cout << "Enter Stones Withe Colors" << endl;
	getline(cin, InputStonesColors);
	InputStonesColors.resize(NumberOfStones);
	cout << "Number Of Stones = " << NumberOfStones << endl;
	for (int i = 0; i < InputStonesColors.size(); i++)
	{
		cout << InputStonesColors[i] << endl;
	}




	//Solving

	int MinNumberOfStones = 0;


	for (int i = 0; i < InputStonesColors.size()-1; i++)
	{

		if (InputStonesColors[i] == InputStonesColors[i+1])
		{
			MinNumberOfStones++;

		}

	}
	cout << "Number Of Stones Needed = " << MinNumberOfStones << endl;
























	system("pause");
	return 0;
}