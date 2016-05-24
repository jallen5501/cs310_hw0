public class Usage {

	private String user;
        private int count;

        public Usage(String user, int count) {
                this.user = user;
                this.count = count;
        }

        public String toString() {
                return this.user + ", " + this.count;
        }

	public int getCount() {
		return this.count;
	}

	public void addCount() {
		this.count++;
	} 

	public String getUser() {
		return this.user;
	}

}
