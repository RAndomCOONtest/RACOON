package racoon.entity;

import java.util.List;

public class Tag extends NamedElement
{
	List<Tag> relativeTags;
	List<Tag> synonyms;
	List<Tag> narrowerTags;
	Tag widerTerm;
	Tag preferredTag;
	
	public Tag getWiderTerm() {
		return widerTerm;
	}
	public void setWiderTerm(Tag widerTerm) {
		this.widerTerm = widerTerm;
	}
	public Tag getPreferredTag() {
		return preferredTag;
	}
	public void setPreferredTag(Tag preferredTag) {
		this.preferredTag = preferredTag;
	}
	public List<Tag> getRelativeTags() {
		return relativeTags;
	}
	public List<Tag> getSynonyms() {
		return synonyms;
	}
	public List<Tag> getNarrowerTags() {
		return narrowerTags;
	}
	
	
	
}
