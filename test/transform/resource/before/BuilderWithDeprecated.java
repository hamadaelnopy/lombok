//platform !ecj: Javadoc copying not supported on ecj
import com.google.common.collect.ImmutableList;
import lombok.Builder;
import lombok.Singular;

@Builder
public class BuilderWithDeprecated {
	/** @deprecated since always */ String dep1;
	@Deprecated int dep2;
	@Singular @Deprecated java.util.List<String> strings;
	@Singular @Deprecated ImmutableList<Integer> numbers;
}
