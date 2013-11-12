// Copyright (c) Copyright (c) The University of Edinburgh, Universidad Politecnica de Madrid, 2009-2012.
//
// LICENCE-START
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// LICENCE-END

package es.upm.fi.dia.oeg.ogsadai.sparql.optimizers.visitor;

import uk.org.ogsadai.expression.AndExpression;
import uk.org.ogsadai.expression.ArithmeticExpressionOperand;
import uk.org.ogsadai.expression.EqualExpression;
import uk.org.ogsadai.expression.Expression;
import uk.org.ogsadai.expression.ExpressionVisitor;
import uk.org.ogsadai.expression.GreaterThanExpression;
import uk.org.ogsadai.expression.GreaterThanOrEqualExpression;
import uk.org.ogsadai.expression.InExpression;
import uk.org.ogsadai.expression.IsNullExpression;
import uk.org.ogsadai.expression.LessThanExpression;
import uk.org.ogsadai.expression.LessThanOrEqualExpression;
import uk.org.ogsadai.expression.LikeExpression;
import uk.org.ogsadai.expression.NotEqualExpression;
import uk.org.ogsadai.expression.NotExpression;
import uk.org.ogsadai.expression.OrExpression;
import uk.org.ogsadai.expression.arithmetic.ArithmeticExpression;
import uk.org.ogsadai.expression.arithmetic.visitors.OperandTypeArithmeticExprVisitor;
import uk.org.ogsadai.expression.arithmetic.visitors.OperandTypeArithmeticExprVisitor.OperandType;
import uk.org.ogsadai.expression.visitors.PredicateTypeExprVisitor.PredicateType;

public class RDFExpressionVisitor implements ExpressionVisitor{
	
	/** Predicate type. */
    private PredicateType mPredicateType;
    
    private ArithmeticExpression lhe;
	private ArithmeticExpression rhe;
	
	public ArithmeticExpression getRighHandExpression(){
		return rhe;
	}
	
	public ArithmeticExpression getLeftHandExpression(){
		return lhe;
	}


//	@Override
	public void visitAndExpression(AndExpression expression) {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void visitEqualExpression(EqualExpression expression) {
		OperandTypeArithmeticExprVisitor leftVisitor = new OperandTypeArithmeticExprVisitor();
        OperandTypeArithmeticExprVisitor rightVisitor = new OperandTypeArithmeticExprVisitor();
        
        ((ArithmeticExpressionOperand) expression.getLeftOperand())
            .getExpression().accept(leftVisitor);
        ((ArithmeticExpressionOperand) expression.getRightOperand())
            .getExpression().accept(rightVisitor);
        
        
        OperandType leftType = leftVisitor.getOperandType();
        OperandType rightType = rightVisitor.getOperandType();
        
        if ((leftType == OperandType.ATTR && rightType == OperandType.CONST)
            || (rightType == OperandType.ATTR && leftType == OperandType.CONST))
        {
            mPredicateType = PredicateType.EQ_ATTR_CONST;
            rhe = ((ArithmeticExpressionOperand) expression.getRightOperand())
            .getExpression();
            
            lhe = ((ArithmeticExpressionOperand) expression.getLeftOperand())
            .getExpression();
        }
        else if ((leftType == OperandType.FUNC && rightType == OperandType.CONST)
            || (rightType == OperandType.FUNC && leftType == OperandType.CONST))
        {
            mPredicateType = PredicateType.EQ_FUNC_CONST;
        }
        else if ((leftType == OperandType.ATTR && rightType == OperandType.FUNC)
            || (rightType == OperandType.ATTR && leftType == OperandType.FUNC))
        {
            mPredicateType = PredicateType.EQ_FUNC_ATTR;
        }
        else if ((leftType == OperandType.ATTR && rightType == OperandType.ATTR)
            || (rightType == OperandType.ATTR && leftType == OperandType.ATTR))
        {
            mPredicateType = PredicateType.EQ_ATTR_ATTR;
        }
	}

//	@Override
	public void visitGreaterThanExpression(GreaterThanExpression expression) {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void visitGreaterThanOrEqualExpression(
			GreaterThanOrEqualExpression expression) {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void visitIsNullExpression(IsNullExpression expression) {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void visitLessThanExpression(LessThanExpression expression) {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void visitLessThanOrEqualExpression(
			LessThanOrEqualExpression expression) {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void visitLikeExpression(LikeExpression expression) {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void visitNotEqualExpression(NotEqualExpression expression) {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void visitNotExpression(NotExpression expression) {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void visitOrExpression(OrExpression expression) {
		// TODO Auto-generated method stub
		
	}

	public String getPredUri() {
		return "";//mPredicateType.name();
	}

	public void visitExpression(AndExpression expression) {
//		lhe = expression.getLeftExpression();
//		rhe = expression.getRightExpression();
	}

	@Override
	public void visitInExpression(InExpression expression) {
		// TODO Auto-generated method stub
		
	}

}
