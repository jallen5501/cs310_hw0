public class Usage {

	private final String user;
        private int count;

        public Usage(String user, int count) {
                this.user = user;
                this.count = count;
        }

	public int getCount() { 
		return this.count; 
	}
	
	public void incrementCount() { 
		this.count++; 
	}

	public String getUser() { 
		return this.user; 
	}

	public String toString() { 
		return this.user + ", " + this.count; 
	}
}
