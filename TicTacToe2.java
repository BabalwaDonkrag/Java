/*Name: Babalwa Donkrag
Task: Assignment 3.1
date: 09 November 2015
*/
import java.util.Scanner;

public class TicTacToe2
{

	private static char[][] board = new char[4][4];

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		initBoard();
		displayBoard();
		int tie = 0;
		char winner = 'N';
		
		while (tie < 16  && winner == 'N')
		{
		
			if (winner == 'N')
			{
				System.out.println("'X' choose your location.(row, column): ");
				int r = keyboard.nextInt();
				int c = keyboard.nextInt();
				boolean position = false;
				try
				{
				position = checkPosition(r,c);
				}
				catch (java.lang.ArrayIndexOutOfBoundsException e)
				{
				System.out.println("You have entered a location that is not in the grid.");
				}
				while (position == false)
				{
					System.out.println("Please choose a new location.(row, column): ");
					r = keyboard.nextInt();
					c = keyboard.nextInt();
					position = checkPosition(r,c);
				}
				board[r][c] = 'X';
				displayBoard();
				System.out.println();
				winner = Checkwinnner('X');
				tie++;
			}
			
			
			
			if (winner == 'N' && tie < 16)
			{
				System.out.println("'O' choose your location.(row, column): ");
				int r = keyboard.nextInt();
				int c = keyboard.nextInt();
				boolean position = false;
				try
				{
				position = checkPosition(r,c);
				}
				catch (java.lang.ArrayIndexOutOfBoundsException e)
				{
				System.out.println("You have entered a location that is not in the grid.");
				}
				while (position == false)
				{
					System.out.println("Please choose a new location.(row, column): ");
					r = keyboard.nextInt();
					c = keyboard.nextInt();
					position = checkPosition(r,c);
				}
				board[r][c] = 'O';
				displayBoard();
				System.out.println();
				winner = Checkwinnner('O');
				tie++;
			}
			
		}
		
		if (tie == 16)
		{
			System.out.println("The game is a tie");
		}
		else
		{
			System.out.println(winner + " is the winner.");
		}
	}
	
	public static char Checkwinnner(char turn)
	{
		char check = ' ';
		if (board[0][0] == turn && board[0][1] == turn && board[0][2] == turn && board[0][3] == turn)
			{check = turn;}
		else if (board[1][0] == turn && board[1][1] == turn && board[1][2] == turn && board[1][3] == turn)
			{check = turn;}	
		else if (board[2][0] == turn && board[2][1] == turn && board[2][2] == turn && board[2][3] == turn)
			{check = turn;}	
		else if (board[3][0] == turn && board[3][1] == turn && board[3][2] == turn && board[3][3] == turn)
			{check = turn;}	
		else if (board[0][0] == turn && board[1][0] == turn && board[2][0] == turn && board[3][0] == turn)
			{check = turn;}	
		else if (board[0][1] == turn && board[1][1] == turn && board[2][1] == turn && board[3][1] == turn)
			{check = turn;}	
		else if (board[0][2] == turn && board[1][2] == turn && board[2][2] == turn && board[3][2] == turn)
			{check = turn;}	
		else if (board[0][3] == turn && board[1][3] == turn && board[2][3] == turn && board[3][3] == turn)
			{check = turn;}	
		else if (board[0][0] == turn && board[1][1] == turn && board[2][2] == turn && board[3][3] == turn)
			{check = turn;}	
		else if (board[0][3] == turn && board[1][2] == turn && board[2][1] == turn && board[3][0] == turn)
			{check = turn;}	
		else
			{
				check = 'N';
			}
			
		return check;
	}
	
	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<4; r++ )
			for ( int c=0; c<4; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|" + board[0][3]);
		System.out.println("    --+-+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|" + board[1][3]);
		System.out.println("    --+-+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|" + board[2][3]);
		System.out.println("    --+-+-+--");
		System.out.println("  3  " + board[3][0] + "|" + board[3][1] + "|" + board[3][2] + "|" + board[3][3]);
		System.out.println("     0 1 2 3 ");
	}

	public static boolean checkPosition( int r, int c)
	{
		boolean result = false;
		if (board[r][c] == ' ' && r <4 && c < 4)
		{ result = true;}
	
		return result;
	}
	/*public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}*/
	
}