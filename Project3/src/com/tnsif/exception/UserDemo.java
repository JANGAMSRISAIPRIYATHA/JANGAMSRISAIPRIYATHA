package com.tnsif.exception;

	public class UserDemo {
		public static void main(String[] args) {
			try {
				UserDefined.validate();
			} catch (Age e) {
				// TODO Auto-generated catch block
				System.out.println("exception caught"+e.getMessage());
			}
		}
		}

