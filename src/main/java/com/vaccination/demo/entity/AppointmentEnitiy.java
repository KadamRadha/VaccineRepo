package com.vaccination.demo.entity;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Table(name="Vaccination")
public class AppointmentEnitiy {

//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
	@Id
	Long bookingId;
	Long mobileNo;
	LocalDate dateofbooking;
	Slot slot;
	@OneToOne
	Member member;
	@OneToOne
	VaccineCenter vaccineCenter;
	
	public Appointment() {
		super();
	}
	public Appointment(Long bookingId, Long mobileNo, LocalDate dateofbooking,Slot slot,Member member, VaccineCenter vaccineCenter) {
		super();
		this.bookingId = bookingId;
		this.mobileNo = mobileNo;
		this.dateofbooking = dateofbooking;
		this.slot = slot;
		this.member = member;
		this.vaccineCenter = vaccineCenter;
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public LocalDate getDateofbooking() {
		return dateofbooking;
	}
	public void setDateofbooking(LocalDate dateofbooking) {
		this.dateofbooking = dateofbooking;
	}
	public Slot getSlot() {
		return slot;
	}
	public void setSlot(Slot slot) {
		this.slot = slot;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public VaccineCenter getVaccineCenter() {
		return vaccineCenter;
	}
	public void setVaccineCenter(VaccineCenter vaccineCenter) {
		this.vaccineCenter = vaccineCenter;
	}
