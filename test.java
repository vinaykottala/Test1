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
