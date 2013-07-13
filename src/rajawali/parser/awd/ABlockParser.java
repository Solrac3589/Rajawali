package rajawali.parser.awd;

import rajawali.parser.AWDParser;
import rajawali.parser.AWDParser.IBlockParser;

/**
 * Base class for parsing blocks. Blocks are instantiated by the {@link AWDParser} directly and are not intended for any
 * other use case.
 * 
 * @author Ian Thomas (toxicbakery@gmail.com)
 * 
 */
public abstract class ABlockParser implements IBlockParser {
	
	protected static final int FLAG_BLOCK_PRECISION_MATRIX = 0x01;
	protected static final int FLAG_BLOCK_PRECISION_GEOMETRY = 0x02;
	protected static final int FLAG_BLOCK_PRECISION_PROPERTIES = 0x04;
	protected static final int FLAG_BLOCK_PRECISION_COMPRESSION = 0x08;
	protected static final int FLAG_BLOCK_PRECISION_COMPRESSION_LZMA = 0x16;

}
