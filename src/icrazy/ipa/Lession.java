package icrazy.ipa;

/**
 * Title : <br/>
 * Description : <br/>
 * Copyright : Copyright (c) 2015<br/>
 * Company : Aptech Aprotrain <br/>
 * Create on Sep 13, 2015 2:02:21 PM
 * 
 * @author <a href="mailto:hoanpmp@gmail.com">HoanPham</a>
 * @version Sep 13, 2015 2:02:21 PM
 * 
 */
public class Lession {
	int lessionID;
	String lessionSubject;
	String lessionContent;
	String lessionNote;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Lession [lessionID=" + this.lessionID + ", lessionSubject="
				+ this.lessionSubject + ", lessionContent="
				+ this.lessionContent + ", lessionNote=" + this.lessionNote
				+ "]";
	}

	/**
	 * @return the lessionID
	 */
	public int getLessionID() {
		return this.lessionID;
	}

	/**
	 * @param lessionID
	 *            the lessionID to set
	 */
	public void setLessionID(int lessionID) {
		this.lessionID = lessionID;
	}

	/**
	 * @return the lessionSubject
	 */
	public String getLessionSubject() {
		return this.lessionSubject;
	}

	/**
	 * @param lessionSubject
	 *            the lessionSubject to set
	 */
	public void setLessionSubject(String lessionSubject) {
		this.lessionSubject = lessionSubject;
	}

	/**
	 * @return the lessionContent
	 */
	public String getLessionContent() {
		return this.lessionContent;
	}

	/**
	 * @param lessionContent
	 *            the lessionContent to set
	 */
	public void setLessionContent(String lessionContent) {
		this.lessionContent = lessionContent;
	}

	/**
	 * @return the lessionNote
	 */
	public String getLessionNote() {
		return this.lessionNote;
	}

	/**
	 * @param lessionNote
	 *            the lessionNote to set
	 */
	public void setLessionNote(String lessionNote) {
		this.lessionNote = lessionNote;
	}

	/**
	 * @param lessionID
	 * @param lessionSubject
	 * @param lessionContent
	 * @param lessionNote
	 */
	public Lession(int lessionID, String lessionSubject, String lessionContent,
			String lessionNote) {
		this.lessionID = lessionID;
		this.lessionSubject = lessionSubject;
		this.lessionContent = lessionContent;
		this.lessionNote = lessionNote;
	}

	/**
	 * 
	 */
	public Lession() {
	}

	/**
	 * @param lessionID
	 * @param lessionSubject
	 * @param lessionContent
	 */
	public Lession(int lessionID, String lessionSubject, String lessionContent) {
		this.lessionID = lessionID;
		this.lessionSubject = lessionSubject;
		this.lessionContent = lessionContent;
	}

}
