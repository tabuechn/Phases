/**
 * generated by Xtext 2.10.0
 */
package org.xtext.de.htwg.phases.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.de.htwg.phases.PhasesPackage;
import org.xtext.de.htwg.phases.STREET_TYPE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STREET TYPE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.de.htwg.phases.impl.STREET_TYPEImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.de.htwg.phases.impl.STREET_TYPEImpl#getStreetLenght <em>Street Lenght</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STREET_TYPEImpl extends MinimalEObjectImpl.Container implements STREET_TYPE
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getStreetLenght() <em>Street Lenght</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreetLenght()
   * @generated
   * @ordered
   */
  protected static final int STREET_LENGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStreetLenght() <em>Street Lenght</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreetLenght()
   * @generated
   * @ordered
   */
  protected int streetLenght = STREET_LENGHT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected STREET_TYPEImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PhasesPackage.Literals.STREET_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PhasesPackage.STREET_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStreetLenght()
  {
    return streetLenght;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStreetLenght(int newStreetLenght)
  {
    int oldStreetLenght = streetLenght;
    streetLenght = newStreetLenght;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PhasesPackage.STREET_TYPE__STREET_LENGHT, oldStreetLenght, streetLenght));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PhasesPackage.STREET_TYPE__NAME:
        return getName();
      case PhasesPackage.STREET_TYPE__STREET_LENGHT:
        return getStreetLenght();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PhasesPackage.STREET_TYPE__NAME:
        setName((String)newValue);
        return;
      case PhasesPackage.STREET_TYPE__STREET_LENGHT:
        setStreetLenght((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PhasesPackage.STREET_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PhasesPackage.STREET_TYPE__STREET_LENGHT:
        setStreetLenght(STREET_LENGHT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PhasesPackage.STREET_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PhasesPackage.STREET_TYPE__STREET_LENGHT:
        return streetLenght != STREET_LENGHT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", streetLenght: ");
    result.append(streetLenght);
    result.append(')');
    return result.toString();
  }

} //STREET_TYPEImpl
