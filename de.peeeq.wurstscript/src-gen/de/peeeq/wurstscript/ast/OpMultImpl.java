//generated by parseq
package de.peeeq.wurstscript.ast;

class OpMultImpl implements OpMult, AstElementIntern {
	OpMultImpl() {
	}

	private AstElement parent;
	public AstElement getParent() { return parent; }
	public void setParent(AstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	public AstElement get(int i) {
		switch (i) {
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 0;
	}
	public OpMult copy() {
		return new OpMultImpl();
	}
	@Override public void accept(WPackage.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(NativeFunc.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtIf.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(OpBinary.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprBinary.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(OptExpr.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprVarArrayAccess.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(VarRef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(Indexes.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ArraySizes.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtReturn.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtExitwhen.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(TypeExpr.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(FuncSignature.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassGlobalBlock.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprMemberMethod.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprAtomic.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtDestroy.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(Expr.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtWhile.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WStatements.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(OnDestroyDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprMemberArrayVar.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtCall.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(VarDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprMemberVar.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WParameter.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprNewObject.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprFunctionCall.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ConstructorDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WStatement.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(OpMult.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(Op.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprUnary.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WParameters.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(Arguments.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(NativeType.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(InitBlock.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprCast.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(FuncRef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(LocalVarDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(OptTypeExpr.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtLoop.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(GlobalVarDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtSet.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(TypeRef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprAssignable.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		v.visit(this);
	}
	@Override public <T> T match(Op.Matcher<T> matcher) {
		return matcher.case_OpMult(this);
	}
	@Override public void match(Op.MatcherVoid matcher) {
		matcher.case_OpMult(this);
	}

	@Override public <T> T match(OpBinary.Matcher<T> matcher) {
		return matcher.case_OpMult(this);
	}
	@Override public void match(OpBinary.MatcherVoid matcher) {
		matcher.case_OpMult(this);
	}

	@Override public String toString() {
		return "OpMult";
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