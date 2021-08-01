package com.ojas;

public class student1 implements Comparable<student1> {

		private int id;
		private String sname;
		private double fee;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public double getFee() {
			return fee;
		}
		public void setFee(double fee) {
			this.fee = fee;
		}
		public student1(int id, String sname, double fee) {
			super();
			this.id = id;
			this.sname = sname;
			this.fee = fee;
		}
		@Override
		public String toString() {
			return "student [id=" + id + ", sname=" + sname + ", fee=" + fee + "]";
		}
		@Override
		public int compareTo(student1 o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

