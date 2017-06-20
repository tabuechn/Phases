/**
 * generated by Xtext 2.10.0
 */
package org.xtext.de.htwg.phases.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.de.htwg.phases.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.de.htwg.phases.PhasesPackage
 * @generated
 */
public class PhasesSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PhasesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhasesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PhasesPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PhasesPackage.GAME:
      {
        Game game = (Game)theEObject;
        T result = caseGame(game);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhasesPackage.PHASE:
      {
        Phase phase = (Phase)theEObject;
        T result = casePhase(phase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhasesPackage.PHASE_TYPE:
      {
        PhaseType phaseType = (PhaseType)theEObject;
        T result = casePhaseType(phaseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhasesPackage.NUMBERS_TYPE:
      {
        NUMBERS_TYPE numberS_TYPE = (NUMBERS_TYPE)theEObject;
        T result = caseNUMBERS_TYPE(numberS_TYPE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhasesPackage.COLORS_TYPE:
      {
        COLORS_TYPE colorS_TYPE = (COLORS_TYPE)theEObject;
        T result = caseCOLORS_TYPE(colorS_TYPE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhasesPackage.STREET_TYPE:
      {
        STREET_TYPE streeT_TYPE = (STREET_TYPE)theEObject;
        T result = caseSTREET_TYPE(streeT_TYPE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGame(Game object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Phase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhase(Phase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Phase Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phase Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhaseType(PhaseType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NUMBERS TYPE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NUMBERS TYPE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNUMBERS_TYPE(NUMBERS_TYPE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>COLORS TYPE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>COLORS TYPE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCOLORS_TYPE(COLORS_TYPE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>STREET TYPE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STREET TYPE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSTREET_TYPE(STREET_TYPE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PhasesSwitch
