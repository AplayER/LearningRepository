package com.oj.test;

import java.util.Arrays;

public class DFS {

	public static void main(String[] args) {
		int[][] matrix = {{0,1,1,0,0,0},
				          {1,0,1,1,1,0},
				          {1,1,0,0,1,0},
				          {0,1,0,0,1,1},
				          {0,1,1,1,0,1},
				          {0,0,0,1,1,0},
				          
		};
		boolean[] visited = new boolean[matrix.length];
		Arrays.fill(visited, false);
		for (int i = 0; i < visited.length; i++) {
			if(visited[i]==false){
				DFSearch(matrix,visited,i,1);
			}
		}
		

	}
	
	public static void DFSearch(int[][] matrix,boolean[] visited,
			int u,int depth){
		visited[u] = true;
		System.out.println(u);
		for (int i = u+1; i < visited.length; i++) {
			if (matrix[u][i]>0&&visited[i]==false) {
				DFSearch(matrix,visited,i,depth+1);
			}
		}
	}

}
