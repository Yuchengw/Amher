package com.iamhere.mongodb.entities;

import java.util.Date;

import org.bson.types.ObjectId;

import com.iamhere.entities.PostComment;
import com.iamhere.entities.PostObject;
import com.iamhere.entities.UserObject;
import com.iamhere.platform.func.DmlValidationHandler;

public class DBPostComment extends DBEntityObject {
	private ObjectId parentPost;
	// TODO: to keep it simple now and not consider the rendering
	private String commentBody;
	private ObjectId childComment; // TODO: is this only for child or sibling as
									// well
	private ObjectId createdBy;

	public DBPostComment() {
	}

	public DBPostComment(String id) {
		set_id(id);
	}

	public ObjectId getParentPost() {
		return parentPost;
	}

	public void setParentPost(ObjectId parentPost) {
		this.parentPost = parentPost;
	}

	public String getCommentBody() {
		return commentBody;
	}

	public void setCommentBody(String commentBody) {
		this.commentBody = commentBody;
	}

	public ObjectId getChildComment() {
		return childComment;
	}

	public void setChildComment(ObjectId childComment) {
		this.childComment = childComment;
	}

	public ObjectId getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(ObjectId createdBy) {
		this.createdBy = createdBy;
	}
	
	@Override
	public void saveHook_Validate(DmlValidationHandler dml) {
	}

	@Override
	public String getDbTableName() {
		return "PostComments";
	}

	public void setParentPostWithEntity(PostObject parentPost2) {
		this.parentPost = parentPost2 == null ? null : new ObjectId(parentPost2.getId());
	}

	public void setChildCommentWithEntity(PostComment childComment2) {
		this.childComment = childComment2 == null ? null : new ObjectId(childComment2.getId());
	}

	public void setCreatedByWithEntity(UserObject createdBy2) {
		this.createdBy = createdBy2 == null ? null : new ObjectId(createdBy2.getId());
	}

	

}
