/**
 * generated by Xtext 2.10.0
 */
package org.xtext.de.htwg.phases;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.de.htwg.phases.Game#getPhases <em>Phases</em>}</li>
 * </ul>
 *
 * @see org.xtext.de.htwg.phases.PhasesPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject
{
  /**
   * Returns the value of the '<em><b>Phases</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.de.htwg.phases.Phase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phases</em>' containment reference list.
   * @see org.xtext.de.htwg.phases.PhasesPackage#getGame_Phases()
   * @model containment="true"
   * @generated
   */
  EList<Phase> getPhases();

} // Game
