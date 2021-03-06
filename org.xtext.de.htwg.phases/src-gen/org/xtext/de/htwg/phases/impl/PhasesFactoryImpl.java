/**
 * generated by Xtext 2.10.0
 */
package org.xtext.de.htwg.phases.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.de.htwg.phases.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhasesFactoryImpl extends EFactoryImpl implements PhasesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PhasesFactory init()
  {
    try
    {
      PhasesFactory thePhasesFactory = (PhasesFactory)EPackage.Registry.INSTANCE.getEFactory(PhasesPackage.eNS_URI);
      if (thePhasesFactory != null)
      {
        return thePhasesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PhasesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhasesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PhasesPackage.GAME: return createGame();
      case PhasesPackage.PHASE: return createPhase();
      case PhasesPackage.PHASE_TYPE: return createPhaseType();
      case PhasesPackage.NUMBERS_TYPE: return createNUMBERS_TYPE();
      case PhasesPackage.COLORS_TYPE: return createCOLORS_TYPE();
      case PhasesPackage.STREET_TYPE: return createSTREET_TYPE();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Game createGame()
  {
    GameImpl game = new GameImpl();
    return game;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phase createPhase()
  {
    PhaseImpl phase = new PhaseImpl();
    return phase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhaseType createPhaseType()
  {
    PhaseTypeImpl phaseType = new PhaseTypeImpl();
    return phaseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NUMBERS_TYPE createNUMBERS_TYPE()
  {
    NUMBERS_TYPEImpl numberS_TYPE = new NUMBERS_TYPEImpl();
    return numberS_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COLORS_TYPE createCOLORS_TYPE()
  {
    COLORS_TYPEImpl colorS_TYPE = new COLORS_TYPEImpl();
    return colorS_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STREET_TYPE createSTREET_TYPE()
  {
    STREET_TYPEImpl streeT_TYPE = new STREET_TYPEImpl();
    return streeT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhasesPackage getPhasesPackage()
  {
    return (PhasesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PhasesPackage getPackage()
  {
    return PhasesPackage.eINSTANCE;
  }

} //PhasesFactoryImpl
