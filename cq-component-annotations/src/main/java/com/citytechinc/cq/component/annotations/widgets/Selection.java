package com.citytechinc.cq.component.annotations.widgets;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.citytechinc.cq.component.annotations.Option;

/**
 * Specifies a selection type Widget. A selection may be one of
 *
 * <ol>
 * <li>select</li>
 * <li>radio</li>
 * <li>checkbox</li>
 * <li>combobox</li>
 * </ol>
 *
 * Represents a Widget of type CQ.form.Selection
 *
 */
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface Selection {
	public static final String SELECT = "select";
	public static final String RADIO = "radio";
	public static final String CHECKBOX = "checkbox";
	public static final String COMBOBOX = "combobox";

	public static final String ASC_SORT_DIR = "ASC";
	public static final String DESC_SORT_DIR = "DESC";

	/**
	 * An explicitly enumerated set of options for the selection. Note: if your
	 * options are returned dynamically via a URL, use the optionsUrl property.
	 *
	 * @return
	 */
	public Option[] options() default {};

	/**
	 * The URL from which options are to be pulled. Note: setting this to
	 * anything other than an empty string overrides any settings made in the
	 * options property.
	 *
	 * @return
	 */
	public String optionsUrl() default "";

	/**
	 * A function or the name of a function that will be called on processRecords to receive the options. The function must return an array of options.
	 *
	 * @return String
	 * @see <a href="http://dev.day.com/docs/en/cq/5-6/widgets-api/output/CQ.form.Selection.html#options">Options</a>
	 */
	public String optionsProvider() default "";

	/**
	 * The sort direction of the the options. If "ASC" or "DESC" the options will be sorted by its (internationalized) text.
	 *
	 * @return String
	 */
	public String sortDir() default "";

	/**
	 * The type of the selection. One of "checkbox", "radio", "select" or "combobox". "checkbox" is the only type that supports mulitple values.
	 *
	 * @return String
	 */
	public String type() default RADIO;
}
