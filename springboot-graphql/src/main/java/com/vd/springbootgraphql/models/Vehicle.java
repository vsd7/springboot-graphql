/**
 * 
 */
package com.vd.springbootgraphql.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author vivedesh
 *
 */
@Data
@EqualsAndHashCode
@Entity
public class Vehicle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5064948793204576898L;

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "type", nullable = false)
	private String type;
	@Column(name = "model_code", nullable = false)
	private String modelCode;
	@Column(name = "brand_name")
	private String brandName;
	@Column(name = "launch_date")
	private LocalDate launchDate;
	private transient  String formattedDate;
	// Getter and setter
	public String getFormattedDate() {
		return getLaunchDate().toString();
	}
	}
