//generated by parseq
package de.peeeq.wurstscript.ast;

class StmtLoopImpl implements StmtLoop, AstElementIntern {
	StmtLoopImpl(WPos source, WStatements body) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)source).setParent(this);
		this.source = source;
		if (body == null) throw new IllegalArgumentException();
		((AstElementIntern)body).setParent(this);
		this.body = body;
	}

	private AstElement parent;
	public AstElement getParent() { return parent; }
	public void setParent(AstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private WPos source;
	public void setSource(WPos source) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)this.source).setParent(null);
		((AstElementIntern)source).setParent(this);
		this.source = source;
	} 
	public WPos getSource() { return source; }

	private WStatements body;
	public void setBody(WStatements body) {
		if (body == null) throw new IllegalArgumentException();
		((AstElementIntern)this.body).setParent(null);
		((AstElementIntern)body).setParent(this);
		this.body = body;
	} 
	public WStatements getBody() { return body; }

	public AstElement get(int i) {
		switch (i) {
			case 0: return source;
			case 1: return body;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 2;
	}
	public StmtLoop copy() {
		return new StmtLoopImpl(source.copy(), body.copy());
	}
	@Override public void accept(InitBlock.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WStatement.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(OnDestroyDef.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WStatements.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtIf.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ConstructorDef.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtLoop.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtWhile.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(WStatement.Matcher<T> matcher) {
		return matcher.case_StmtLoop(this);
	}
	@Override public void match(WStatement.MatcherVoid matcher) {
		matcher.case_StmtLoop(this);
	}

	@Override public String toString() {
		return "StmtLoop(" + source + ", " +body+")";
	}
	private boolean attr_attrNearestPackage_isCached = false;
	private PackageOrGlobal attr_attrNearestPackage_cache;
	public PackageOrGlobal attrNearestPackage() {
		if (!attr_attrNearestPackage_isCached) {
			attr_attrNearestPackage_cache = de.peeeq.wurstscript.attributes.AttrNearestPackage.calculate(this);
			attr_attrNearestPackage_isCached = true;
		}
		return attr_attrNearestPackage_cache;
	}
	private boolean attr_attrNearestFuncDef_isCached = false;
	private FuncDef attr_attrNearestFuncDef_cache;
	public FuncDef attrNearestFuncDef() {
		if (!attr_attrNearestFuncDef_isCached) {
			attr_attrNearestFuncDef_cache = de.peeeq.wurstscript.attributes.AttrNearestFuncDef.calculate(this);
			attr_attrNearestFuncDef_isCached = true;
		}
		return attr_attrNearestFuncDef_cache;
	}
	private boolean attr_attrNearestClassDef_isCached = false;
	private ClassDef attr_attrNearestClassDef_cache;
	public ClassDef attrNearestClassDef() {
		if (!attr_attrNearestClassDef_isCached) {
			attr_attrNearestClassDef_cache = de.peeeq.wurstscript.attributes.AttrNearestClassDef.calculate(this);
			attr_attrNearestClassDef_isCached = true;
		}
		return attr_attrNearestClassDef_cache;
	}
}
