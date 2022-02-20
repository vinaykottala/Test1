 public ActionResult Details(int? id)
 {

	 if (id == null)
	 {
	 
		return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
	 }
	 Message Message = db.Messages.Find(id);
	 if (Message == null)
	 {
	 
	  return HttpNotFound();
	 }
	 return View(Message);
 }



public boolean findEmailAddress( String emailAddress) throws Exception {

Connection jdbcConnection = this.getConnection();
	Statement sqlStatement = jdbcConnection.createStatement();
	String sql = "SELECT email FROM user_details WHERE email = "" + emailAddress + "*";

	ResultSet userSearch = sqlStatement.executeQuery(sql);

	if (userSearch.first()) {
		// We have a result, this user already exists; 
	// We found this email address
		return true;

	}
	else {
	// We could not find an email address return false;
		return false;
	}
}

