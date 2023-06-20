import Link from "next/link"

export const Navbar = ({theme}) => {

  return (
      <div data-theme={theme} className="navbar bg-base-100">
        <div className="flex-1">
          <Link href={"/"} className="btn btn-ghost normal-case text-xl">TECH4GOOD</Link>
        </div>
        <div className="flex-none">
          <ul className="menu menu-horizontal px-1">
            <li><a>Qui som?</a></li>
            <li tabIndex={0}>
              <a>
                Comerç
                <svg className="fill-current" xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24"><path d="M7.41,8.58L12,13.17L16.59,8.58L18,10L12,16L6,10L7.41,8.58Z"/></svg>
              </a>
              <ul className="p-2 bg-base-100 z-10">
                <li><Link href={"/comercios"} >Mercats i Fires</Link></li>
                <li><a>Mercats Municipals</a></li>
                <li><a>Grans Establiments</a></li>
                <li><a>Galeries Comercials</a></li>
                <li><a>Centres Comercials</a></li>


              </ul>
            </li>
            <li><a>FAQ´s</a></li>
            <li><a>Contacte</a></li>
          </ul>
      </div>
    </div>

  )
}

// import Link from "next/link"

// export const Navbar = ({theme}) => {

//   return (
//       <div data-theme={theme} className="navbar bg-base-100">
//         <div className="flex-1">
//           <Link href={"/"} className="btn btn-ghost normal-case text-xl">TECH4GOOD</Link>
//         </div>
//         <div className="flex-none">
//           <ul className="menu menu-horizontal px-1">
//                 <li><Link href={"/comercios"} >Mercats i Fires</Link></li>
//                 <li><Link href={"/comercios"} >Mercats Municipals</Link></li>
//                 <li><a>Grans Establiments</a></li>
//                 <li><a>Galeries Comercials</a></li>
//                 <li><a>Centres Comercials</a></li>

//           </ul>
//       </div>
//     </div>

//   )
// }