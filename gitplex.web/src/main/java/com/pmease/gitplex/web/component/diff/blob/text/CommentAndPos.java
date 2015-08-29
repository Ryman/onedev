package com.pmease.gitplex.web.component.diff.blob.text;

import java.io.Serializable;

import com.pmease.gitplex.core.model.PullRequestComment;

public class CommentAndPos implements Serializable {

	private static final long serialVersionUID = 1L;

	PullRequestComment comment;
	
	int oldLineNo;
	
	int newLineNo;
}