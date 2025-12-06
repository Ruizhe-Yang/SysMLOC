standard library package ImageMetadata{
	doc /*
	 * This package provides attributive data and metadata to allow a model element to be
	 * annotated with an image to be used in its graphical rendering or as a marker to
	 * adorn graphical or textual renderings.
	 */
	private import ScalarValues::String;
	attribute def Image{
		doc /*
		 * Image provides the data necessary for the physical definition of 
		 * a graphical image.
		 */
		attribute content [ 0 .. 1 ] : String{
			doc /*
			 * Binary data for the image according to the given MIME type, 
			 * encoded as given by the encoding.
			 */
		}
		attribute encoding [ 0 .. 1 ] : String{
			doc /*
			 * Describes how characters in the content are to be decoded into 
			 * binary data. At least "base64", "hex", "identify", and "JSONescape"
			 * shall be supported.
			 */
		}
		attribute type [ 0 .. 1 ] : String{
			doc /*
			 * The MIME type according to which the content should be interpreted.
			 */
		}
		attribute location [ 0 .. 1 ] : String{
			doc /*
			 * A URI for the location of a resource containing the image content,
			 * as an alternative for embedding it in the content attribute.
			 */
		}
	}
	metadata def Icon{
		doc /*
		 * Icon metadata can be used to annotate a model element with an image to be used
		 * to show render the element on a diagram and/or a small image to be used as an
		 * adornment on a graphical or textual rendering. Alternatively, another metadata
		 * definition can be annotated with an Icon to indicate that any model element 
		 * annotated by the containing metadata can be rendered according to the Icon.
		 */
		attribute fullImage [ 0 .. 1 ] : Image{
			doc /*
			 * A full-sized image that can be used to render the annotated element on a
			 * graphical view, potentially as an alternative to its standard rendering.
			 */
		}
		attribute smallImage [ 0 .. 1 ] : Image{
			doc /*
			 * A smaller image that can be used as an adornment on the graphical rendering
			 * of the annotated element or as a marker in a textual rendering.
			 */
		}
	}
}
