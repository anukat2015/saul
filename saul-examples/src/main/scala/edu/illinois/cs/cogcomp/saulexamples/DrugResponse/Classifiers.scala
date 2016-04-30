package edu.illinois.cs.cogcomp.saulexamples.DrugResponse

import edu.illinois.cs.cogcomp.lbjava.learn.StochasticGradientDescent
import edu.illinois.cs.cogcomp.saul.classifier.Learnable
import edu.illinois.cs.cogcomp.saulexamples.bioInformatics.PatientDrug
import edu.illinois.cs.cogcomp.saulexamples.DrugResponse.KnowEngDataModel._
import edu.illinois.cs.cogcomp.saul.constraint.ConstraintTypeConversion._
/** Created by Parisa on 6/25/15.
  */
object Classifiers {
  object dResponseClassifier extends Learnable[PatientDrug](KnowEngDataModel) {
    def label = drugResponse
    override def feature = using(cP1)
    override lazy val classifier = new StochasticGradientDescent
  }
  object DrugResponseRegressor extends Learnable[PatientDrug](KnowEngDataModel) {
    def label = drugResponse
    override def feature = using(pathWayGExpression)
    override lazy val classifier = new StochasticGradientDescent
  }
}
